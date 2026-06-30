package BuilderPattern;
public class ProductClass
{
	private String cpu;
	private String RAM;
	private int storage;
	private boolean graphics;
	private ProductClass(Builder builder)
	{
		this.cpu=builder.cpu;
		this.RAM=builder.RAM;
		this.storage=builder.storage;
		this.graphics=builder.graphics;
	}
	public void display()
	{
		 System.out.println("Computer Configuration");
	        System.out.println("-----------------------");
	        System.out.println("CPU       : " + cpu);
	        System.out.println("RAM       : " + RAM);
	        System.out.println("Storage   : " + storage + " GB");
	        System.out.println("Graphics  : " + graphics);
	}
	public static class Builder
	{
		private String cpu;
		private String RAM;
		private int storage;
		private boolean graphics;
		public Builder()
		{
			
		}
		public Builder setcpu(String cpu)
		{
			this.cpu =cpu;
			return this;
		}
		public Builder setRAM(String RAM)
		{
			this.RAM =RAM;
			return this;
		}
		public Builder setStorage(int storage)
		{
			this.storage=storage;
			return this;
		}
		public Builder setGraphics(boolean graphics) {
            this.graphics = graphics;
            return this;
        }
		public ProductClass build() {
			return new ProductClass(this);
		}
	}
}