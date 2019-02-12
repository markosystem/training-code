setup:
	@npm install --global mocha
	@npm install --save-dev mocha

tests:
	@yarn test

watch:
	@fswatch -0 . | xargs -0 -n1 -I{} make tests