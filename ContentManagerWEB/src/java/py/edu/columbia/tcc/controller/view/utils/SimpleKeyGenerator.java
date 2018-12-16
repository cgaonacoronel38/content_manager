/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.controller.view.utils;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 *
 * @author tokio
 */
public class SimpleKeyGenerator {
    public Key generateKey() {
        String keyString = "nAbnBvPE2UnAPEaKJKYwT5YeNGCwr6Gunjvz3rvfFJXugeZFsEvj9R5sTQm73WsMXj4SpxhknkPLk7rYGmWW5hNExyPWhKtvJhyCxZnTb4fJUGMUvTjKGcSLqyH5YEdeXwyGZPTSGBsFpHyQsHY3JXsZPqCU6geKKCuaU7yJDkwLEkdyXsmvtQSDqbTFK3Ds7PGZ4tDXDVjksX2G6gpbbY42CHMjkwgEEM29ZnmAfDVf8FTUBVxF39Q5BHFN9FJ9";
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "AES");
        return key;
    }
}
