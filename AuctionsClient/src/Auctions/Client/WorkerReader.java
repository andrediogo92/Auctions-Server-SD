/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auctions.Client;


import Auctions.Util.Wrapper;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Andre
 */
public class WorkerReader implements Runnable 
{
    private final Socket RequestSocket;
    private final BufferedReader SocketInput;
    private final PrintWriter SystemOut;
    private final Wrapper<String> SharedString;

    public WorkerReader(Socket RequestSocket, 
                        BufferedReader SocketInput, 
                        PrintWriter SystemOut,
                        Wrapper<String>SharedString) 
    {

    }


    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
