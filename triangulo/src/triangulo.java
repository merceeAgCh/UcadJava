
    public class triangulo
    {
        private double base;
        private double altura;
        private double areatriangulo;


        public triangulo(double base, double altura)
        {
            this.base = base;
            this.altura = altura;
        }

        public double getbase()
        {
            return base;
        }

        public void setbase(double base)
        {
            this.base = base;
        }

        public double getaltura()
        {
            return altura;
        }

        public void setaltura(double altura)
        {
            this.altura = altura;
        }

        public double getareatriangulo()
        {
            return areatriangulo;
        }


        public void area()
        {
            areatriangulo = base * altura / 2;
        }

    }
}
