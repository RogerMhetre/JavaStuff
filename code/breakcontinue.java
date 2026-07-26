public class breakcontinue {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		}

        System.out.println();

		int j = 0;
		while (j < 10) {
			if (j == 5) {
                j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
	}
}
