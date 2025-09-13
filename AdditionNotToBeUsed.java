package temp.advance;

class AdditionNotToBeUsed extends AbstractOperations {
	
	public AdditionNotToBeUsed(int num1,int num2) {
		super.num1 = num1;
		super.num2 = num2;
	}
	
	public AdditionNotToBeUsed(int num1,int num2,int num3) {
		super.num1 = num1;
		super.num2 = num2;
		super.num3 = num3;
	}

	//Operation
	private void performAddOps() {
		super.result = super.num1 + super.num2;
	}
	
	//Operation
	private void performAddOperationMultiple() {
		super.result = super.num1 + super.num2 + super.num3;
	}
	
	@Override
	protected void performOperation() {
		performAddOps();
	}
	


}
