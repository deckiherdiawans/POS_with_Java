/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.Interface;

/**
 *
 * @author Decki
 */
import Penjualan.Entity.Pelanggan;
import java.sql.SQLException;
import java.util.List;

public interface PelangganInterface {
    Pelanggan insert(Pelanggan o) throws SQLException;
    void update(Pelanggan o) throws SQLException;
    void delete(String IDPelanggan) throws SQLException;
    List getAll() throws SQLException;
}