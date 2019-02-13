var assert = require('assert');
var dojo = require('../src/dojo');

describe('Troco', function() {
  it('Entregue 100, pago 50 e troco de 50', function() {
    assert.equal(dojo.calculaTroco(100, 50), 50);
  });
  it('Entregue 100, pago 40 e troco de 60', function() {
    assert.equal(dojo.calculaTroco(100, 40), 60);
  });
  it('Entregue 100, pago 80 e troco de 20', function() {
    assert.equal(dojo.calculaTroco(100, 80), 20);
  });
  it('Entregue 100, pago 75.99 e troco de 24.01', function() {
    assert.equal(dojo.calculaTroco(100, 75.99), 24.01);
  });
});

describe('Cédulas', function() {
  it('Valor 100, retorna [100]', function() {
    assert.deepEqual(dojo.cedulas(100), ['100']);
  });
  it('Valor 150, retorna [100,50]', function() {
    assert.deepEqual(dojo.cedulas(150), ['100', '50']);
  });
  it('Valor 200, retorna [100,100]', function() {
    assert.deepEqual(dojo.cedulas(200), ['100', '100']);
  });
  it('Valor 25, retorna [20,5]', function() {
    assert.deepEqual(dojo.cedulas(25), ['20', '5']);
  });
});
