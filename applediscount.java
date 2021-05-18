package main7;

public class applediscount {

    int rateofdiscount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    private static interface getdiscount {
    }

    class AppleDiscount implements getdiscount {

        public float rateofdiscount() {
            return 0.20f;
        }

    }

    class duriandiscount implements getdiscount {

        public float rateofdiscount() {
            return 0.15f;
        }
    }

    class mangoediscount implements getdiscount {

        public float rateofdiscount() {
            return 0.10f;
        }
    }
}
