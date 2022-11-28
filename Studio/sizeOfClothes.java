package com.metanit.Studio;

public class sizeOfClothes {
    public enum Sizes {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);

        private final int euroSize;

        private Sizes(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return this.euroSize;
        }

        public String getDescription() {
            if (this == Sizes.XXS) {
                return "Kid's size";
            } else return "Adult's size";
        }
    }

}
