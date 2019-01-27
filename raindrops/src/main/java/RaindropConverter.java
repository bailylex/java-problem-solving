class RaindropConverter {

    String convert(int number) {
        for (int i = 1; i <= number; ++i) {
            int myFactor = number % i;
            if (myFactor == 0) {
                switch (myFactor) {
                    case 3:
                        System.out.println("Pling");
                        break;
                        
                    case 5:
                        System.out.println("Plang");
                        break;
                        
                    case 7:
                        System.out.println("Plong");
                        break;
                }
            } else {
                System.out.println(i + " ");
            }
        }
        
        return String.valueOf(number);
    }

}
