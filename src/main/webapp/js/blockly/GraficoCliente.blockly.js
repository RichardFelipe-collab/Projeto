window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GraficoCliente = window.blockly.js.blockly.GraficoCliente || {};

/**
 * Gráfico
 */
window.blockly.js.blockly.GraficoCliente.popularGraficoArgs = [];
window.blockly.js.blockly.GraficoCliente.popularGrafico = async function() {
 var dados, legenda, serie, linha;
  dados = this.cronapi.screen.getValueOfField('Estatisticas.data');
  legenda = [];
  serie = [];
  for (var linha_index in dados) {
    linha = dados[linha_index];
    legenda.push(this.cronapi.object.getObjectField(linha, 'posto_posto'));
    serie.push(this.cronapi.object.getObjectField(linha, 'valor'));
    this.cronapi.chart.createChart("chart-clientes", 'bar', legenda, null, this.cronapi.chart.createDataset('Custo Médio', serie, null));
  }
}
