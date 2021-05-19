window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Login = window.blockly.js.blockly.Login || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.FecharModalCadastroArgs = [];
window.blockly.js.blockly.Login.FecharModalCadastro = async function() {
 var SucessoCadastro;
  this.cronapi.screen.hideModal("modal-nome");
}

/**
 * Login
 */
window.blockly.js.blockly.Login.AbrirModalCadastroArgs = [];
window.blockly.js.blockly.Login.AbrirModalCadastro = async function() {
 var SucessoCadastro;
  this.cronapi.screen.showModal("modal-nome");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.ConfirmarCadastroArgs = [];
window.blockly.js.blockly.Login.ConfirmarCadastro = async function() {
 var SucessoCadastro;
  if (this.cronapi.screen.getValueOfField("vars.senha") == this.cronapi.screen.getValueOfField("vars.confirmaSenha")) {
    if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.nome"))) {
      this.cronapi.screen.notify('error','Nome não informado');
    } else if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.email"))) {
      this.cronapi.screen.notify('error','E-mail não informado\n');
    } else if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.senha"))) {
      this.cronapi.screen.notify('error',this.cronapi.i18n.translate("LoginBlockly",[  ]));
    } else {
      this.cronapi.util.callServerBlocklyAsynchronous('blockly.Usuario:Cadastrar', async function(sender_SucessoCadastro) {
          SucessoCadastro = sender_SucessoCadastro;
        if (SucessoCadastro) {
          this.cronapi.screen.hideModal("modal-nome");
          this.cronapi.screen.notify('success','Usuário cadastrado com sucesso');
        } else {
          this.cronapi.screen.notify('error','Erro no cadastro de usuario');
        }
      }.bind(this), this.cronapi.screen.getValueOfField("vars.nome"), this.cronapi.screen.getValueOfField("vars.email"), this.cronapi.screen.getValueOfField("vars.senha"), this.cronapi.screen.getValueOfField("vars.confirmaSenha"));
    }
  } else {
    this.cronapi.screen.notify('error','Senha de confirmação não são iguais');
  }
}
