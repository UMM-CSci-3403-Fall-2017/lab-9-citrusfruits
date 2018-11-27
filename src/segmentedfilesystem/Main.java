package segmentedfilesystem;

import java.net.*;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        int port = 6014;
        ArrayList<byte[]> header = new ArrayList<>();
        ArrayList<byte[]> data = new ArrayList<>();

        try {
            byte[] buffer = new byte[1028];
            DatagramPacket packet = new DatagramPacket(buffer, 0);
            InetAddress host = InetAddress.getByName("heartofgold.morris.umn.edu");
            DatagramSocket socket = new DatagramSocket(port);

            while (true) {
                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 0){
                        header.add(buffer);
                    }
                    else {
                        data.add(buffer);
                    }
                }
            }



        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        //DatagramSocket socket = new DatagramSocket(6014);
    }

}
