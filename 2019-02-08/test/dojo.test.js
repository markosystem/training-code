var assert = require('assert');
var dojo = require('../src/dojo');

describe('[Minumum]', function () {
    it('Array [3] expect 3', function () {
        assert.equal(dojo.min([3]), 3);
    });
    it('Array [2,3] expect 2', function () {
        assert.equal(dojo.min([2, 3]), 2);
    });
    it('Array [3,-2,4] expect 2', function () {
        assert.equal(dojo.min([3, -2, 4]), -2);
    });
    it('Array [6, 9, 15, -2, 92, 11] expect 2', function () {
        assert.equal(dojo.min([6, 9, 15, -2, 92, 11]), -2);
    });
});

describe('[Maximum]', function () {
    it('Array [3] expect 3', function () {
        assert.equal(dojo.max([3]), 3);
    });
    it('Array [3,4] expect 4', function () {
        assert.equal(dojo.max([3, 4]), 4);
    });
    it('Array [1,4,9] expect 9', function () {
        assert.equal(dojo.max([1, 4, 9]), 9);
    });
    it('Array [6, 9, 15, -2, 92, 11] expect 92', function () {
        assert.equal(dojo.max([6, 9, 15, -2, 92, 11]), 92);
    });
});

describe('[Length]', function () {
    it('Array [3] expect 1', function () {
        assert.equal(dojo.len([3]), 1);
    });
    it('Array [3,4] expect 2', function () {
        assert.equal(dojo.len([3, 4]), 2);
    });
    it('Array [3,4,5] expect 3', function () {
        assert.equal(dojo.len([3, 4, 5]), 3);
    });
    it('Array [6, 9, 15, -2, 92, 11] expect 6', function () {
        assert.equal(dojo.len([6, 9, 15, -2, 92, 11]), 6);
    });
});

describe('[Avg]', function () {
    it('Array [3] expect 1', function () {
        assert.equal(dojo.avg([3]), 3);
    });
    it('Array [3,6] expect 4.5', function () {
        assert.equal(dojo.avg([3, 6]), 4.5);
    });
    it('Array [3,6,1] expect 3.3333333333333335', function () {
        assert.equal(dojo.avg([3, 6, 1]), 3.3333333333333335);
    });
    it('Array [6, 9, 15, -2, 92, 11] expect 21.833333333333332', function () {
        assert.equal(dojo.avg([6, 9, 15, -2, 92, 11]), 21.833333333333332);
    });
})

describe('[Main]', function () {
    it('Array [6, 9, 15] expect [6, 15, 3, 10]', function () {
        assert.deepEqual(dojo.main([6, 9, 15]), [6, 15, 3, 10]);
    });
    it('Array [6, 9, 15, -2, 92, 11] expect [-2, 92, 6, 21.833333333333332]', function () {
        assert.deepEqual(dojo.main([6, 9, 15, -2, 92, 11]), [-2, 92, 6, 21.833333333333332]);
    });
})

describe('[OutPut]', function () {
    const output = `Valor mínimo: -2\n
Valor máximo: 92\n
Número de elementos na seqüência: 6\n
Valor médio: 21.833333333333332\n`

    const output2 = `Valor mínimo: 6\n
Valor máximo: 15\n
Número de elementos na seqüência: 3\n
Valor médio: 10\n`

    it('Array [6, 9, 15, -2, 92, 11] expect [-2, 92, 6, 21.833333333333332]', function () {
        assert.equal(dojo.output([6, 9, 15, -2, 92, 11]), output);
    });
    it('Array [6, 9, 15] expect [-2, 92, 6, 21.833333333333332]', function () {
        assert.equal(dojo.output([6, 9, 15]), output2);
    });
})