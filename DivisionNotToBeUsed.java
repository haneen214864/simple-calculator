package temp.advance;

class DivisionNotToBeUsed extends AbstractOperations {

	public DivisionNotToBeUsed(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	private void performDivision() {
		super.result = super.num1 / super.num2;
	}
	
	@Override
	protected void performOperation() {
		performDivision();
	}

}
