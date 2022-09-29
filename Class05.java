class CBox {
	int length;
	int width;
	int height;

	void volume() {
		System.out.println("volume=" + length * width * height);
	}

	void surfArea() {
		System.out.println("surfArea=" + (length * width + length * height + width * height) * 2);
	}

	void showData() {
		System.out.println("length=" + length);
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}

	void showAll() {
		showData();
		surfArea();
		volume();
	}
}

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();
	}

}
