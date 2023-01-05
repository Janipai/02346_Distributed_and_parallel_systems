public class Main {
    public static void main(String[] args) {
        String input =
                "Size (bytes):     4096, Stride (bytes):   4, read+write: -1.42 ns\n" +
                        "Size (bytes):     4096, Stride (bytes):   8, read+write: -1.45 ns\n" +
                        "Size (bytes):     4096, Stride (bytes):  16, read+write: -1.44 ns\n" +
                        "Size (bytes):     4096, Stride (bytes):  32, read+write: -1.29 ns\n" +
                        "Size (bytes):     4096, Stride (bytes):  64, read+write: -1.40 ns\n" +
                        "Size (bytes):     4096, Stride (bytes): 128, read+write: -1.30 ns\n" +
                        "Size (bytes):     4096, Stride (bytes): 256, read+write: -1.47 ns\n" +
                        "Size (bytes):     4096, Stride (bytes): 512, read+write: -1.12 ns\n" +
                        "Size (bytes):     8192, Stride (bytes):   4, read+write: -1.38 ns\n" +
                        "Size (bytes):     8192, Stride (bytes):   8, read+write: -1.37 ns\n" +
                        "Size (bytes):     8192, Stride (bytes):  16, read+write: -1.34 ns\n" +
                        "Size (bytes):     8192, Stride (bytes):  32, read+write: -1.36 ns\n" +
                        "Size (bytes):     8192, Stride (bytes):  64, read+write: -1.25 ns\n" +
                        "Size (bytes):     8192, Stride (bytes): 128, read+write: -1.37 ns\n" +
                        "Size (bytes):     8192, Stride (bytes): 256, read+write: -1.35 ns\n" +
                        "Size (bytes):     8192, Stride (bytes): 512, read+write: -1.27 ns\n" +
                        "Size (bytes):    16384, Stride (bytes):   4, read+write: -1.42 ns\n" +
                        "Size (bytes):    16384, Stride (bytes):   8, read+write: -1.38 ns\n" +
                        "Size (bytes):    16384, Stride (bytes):  16, read+write: -1.39 ns\n" +
                        "Size (bytes):    16384, Stride (bytes):  32, read+write: -1.38 ns\n" +
                        "Size (bytes):    16384, Stride (bytes):  64, read+write: -1.33 ns\n" +
                        "Size (bytes):    16384, Stride (bytes): 128, read+write: -1.29 ns\n" +
                        "Size (bytes):    16384, Stride (bytes): 256, read+write: -1.40 ns\n" +
                        "Size (bytes):    16384, Stride (bytes): 512, read+write: -1.27 ns\n" +
                        "Size (bytes):    32768, Stride (bytes):   4, read+write: -1.39 ns\n" +
                        "Size (bytes):    32768, Stride (bytes):   8, read+write: -1.43 ns\n" +
                        "Size (bytes):    32768, Stride (bytes):  16, read+write: -1.40 ns\n" +
                        "Size (bytes):    32768, Stride (bytes):  32, read+write: -1.38 ns\n" +
                        "Size (bytes):    32768, Stride (bytes):  64, read+write: -1.39 ns\n" +
                        "Size (bytes):    32768, Stride (bytes): 128, read+write: -1.29 ns\n" +
                        "Size (bytes):    32768, Stride (bytes): 256, read+write: -1.32 ns\n" +
                        "Size (bytes):    32768, Stride (bytes): 512, read+write: -1.33 ns\n" +
                        "Size (bytes):    65536, Stride (bytes):   4, read+write: -1.38 ns\n" +
                        "Size (bytes):    65536, Stride (bytes):   8, read+write: -1.41 ns\n" +
                        "Size (bytes):    65536, Stride (bytes):  16, read+write: -1.41 ns\n" +
                        "Size (bytes):    65536, Stride (bytes):  32, read+write: -1.42 ns\n" +
                        "Size (bytes):    65536, Stride (bytes):  64, read+write: -1.18 ns\n" +
                        "Size (bytes):    65536, Stride (bytes): 128, read+write: -0.24 ns\n" +
                        "Size (bytes):    65536, Stride (bytes): 256, read+write: -0.20 ns\n" +
                        "Size (bytes):    65536, Stride (bytes): 512, read+write:  0.71 ns\n" +
                        "Size (bytes):   131072, Stride (bytes):   4, read+write: -1.41 ns\n" +
                        "Size (bytes):   131072, Stride (bytes):   8, read+write: -1.40 ns\n" +
                        "Size (bytes):   131072, Stride (bytes):  16, read+write: -1.40 ns\n" +
                        "Size (bytes):   131072, Stride (bytes):  32, read+write: -1.40 ns\n" +
                        "Size (bytes):   131072, Stride (bytes):  64, read+write: -1.16 ns\n" +
                        "Size (bytes):   131072, Stride (bytes): 128, read+write: -0.24 ns\n" +
                        "Size (bytes):   131072, Stride (bytes): 256, read+write: -0.28 ns\n" +
                        "Size (bytes):   131072, Stride (bytes): 512, read+write:  0.71 ns\n" +
                        "Size (bytes):   262144, Stride (bytes):   4, read+write: -1.41 ns\n" +
                        "Size (bytes):   262144, Stride (bytes):   8, read+write: -1.42 ns\n" +
                        "Size (bytes):   262144, Stride (bytes):  16, read+write: -1.41 ns\n" +
                        "Size (bytes):   262144, Stride (bytes):  32, read+write: -1.40 ns\n" +
                        "Size (bytes):   262144, Stride (bytes):  64, read+write: -1.16 ns\n" +
                        "Size (bytes):   262144, Stride (bytes): 128, read+write: -0.24 ns\n" +
                        "Size (bytes):   262144, Stride (bytes): 256, read+write: -0.20 ns\n" +
                        "Size (bytes):   262144, Stride (bytes): 512, read+write:  0.78 ns\n" +
                        "Size (bytes):   524288, Stride (bytes):   4, read+write: -1.40 ns\n" +
                        "Size (bytes):   524288, Stride (bytes):   8, read+write: -1.39 ns\n" +
                        "Size (bytes):   524288, Stride (bytes):  16, read+write: -1.40 ns\n" +
                        "Size (bytes):   524288, Stride (bytes):  32, read+write: -1.42 ns\n" +
                        "Size (bytes):   524288, Stride (bytes):  64, read+write: -1.12 ns\n" +
                        "Size (bytes):   524288, Stride (bytes): 128, read+write: -0.24 ns\n" +
                        "Size (bytes):   524288, Stride (bytes): 256, read+write: -0.20 ns\n" +
                        "Size (bytes):   524288, Stride (bytes): 512, read+write:  1.13 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes):   4, read+write: -1.40 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes):   8, read+write: -1.39 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes):  16, read+write: -1.38 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes):  32, read+write: -1.29 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes):  64, read+write: -0.41 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes): 128, read+write:  0.56 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes): 256, read+write:  0.64 ns\n" +
                        "Size (bytes):  1048576, Stride (bytes): 512, read+write:  2.09 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes):   4, read+write: -1.42 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes):   8, read+write: -1.42 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes):  16, read+write: -1.40 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes):  32, read+write: -1.06 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes):  64, read+write:  0.88 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes): 128, read+write:  2.79 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes): 256, read+write:  2.88 ns\n" +
                        "Size (bytes):  2097152, Stride (bytes): 512, read+write:  2.78 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes):   4, read+write: -1.42 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes):   8, read+write: -1.42 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes):  16, read+write: -1.44 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes):  32, read+write: -1.06 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes):  64, read+write:  0.97 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes): 128, read+write:  2.88 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes): 256, read+write:  3.08 ns\n" +
                        "Size (bytes):  4194304, Stride (bytes): 512, read+write:  3.18 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes):   4, read+write: -1.45 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes):   8, read+write: -1.42 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes):  16, read+write: -1.42 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes):  32, read+write: -0.98 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes):  64, read+write:  0.99 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes): 128, read+write:  2.88 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes): 256, read+write:  3.08 ns\n" +
                        "Size (bytes):  8388608, Stride (bytes): 512, read+write:  2.98 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes):   4, read+write: -1.45 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes):   8, read+write: -1.42 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes):  16, read+write: -1.45 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes):  32, read+write: -1.06 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes):  64, read+write:  0.99 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes): 128, read+write:  2.88 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes): 256, read+write:  3.18 ns\n" +
                        "Size (bytes): 16777216, Stride (bytes): 512, read+write:  3.08 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes):   4, read+write: -1.39 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes):   8, read+write: -1.19 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes):  16, read+write: -0.79 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes):  32, read+write:  0.50 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes):  64, read+write:  3.68 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes): 128, read+write:  7.05 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes): 256, read+write:  7.55 ns\n" +
                        "Size (bytes): 33554432, Stride (bytes): 512, read+write:  6.56 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes):   4, read+write: -1.37 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes):   8, read+write: -1.09 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes):  16, read+write: -0.60 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes):  32, read+write:  1.29 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes):  64, read+write:  5.07 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes): 128, read+write: 10.33 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes): 256, read+write: 11.82 ns\n" +
                        "Size (bytes): 67108864, Stride (bytes): 512, read+write: 10.03 ns";

        String[] arr = input.split("\n");

        System.out.println("LENGTH: " + arr.length);
        System.out.println();

        int stride = 4;
        for (int k = 0; k < 8; k++) {
            System.out.print("Stride: " + stride + " -> ");
            stride = stride*2;
            for (int i = k; i < arr.length; i=i+8)
                System.out.print(arr[i].split("write: ")[1].replace(" ns", "") + ", ");
            System.out.println();
        }

        int bytes = 4096;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%8==0) {
                System.out.print("\n" + count++ + " Bytes: " + bytes + " -> ");
                bytes = bytes * 2;
            }
            System.out.print(arr[i].split("write: ")[1].replace(" ns", "") + ", ");
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i].split("write: ")[1].replace(" ns", "") + ", ");
        System.out.println();
    }
}
