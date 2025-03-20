public class Faktorial16 {

    int faktorialBF, factorialDC;
    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while(i < n) {
            fakto *= i;
            i++;
        }
        
        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        return fakto;
    }

    int factorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * factorialDC(n - 1);
            return fakto;
        }
    }
}