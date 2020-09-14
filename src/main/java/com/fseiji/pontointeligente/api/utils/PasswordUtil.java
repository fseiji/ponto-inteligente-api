package com.fseiji.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {

	private static Logger LOG = LoggerFactory.getLogger(PasswordUtil.class);

	public PasswordUtil() {
	}

	/*
	 * Gera um hash utilizando o BCrypt
	 * 
	 * @param senha
	 * 
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		LOG.info("Gerando hash com o BCrypt.");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
}
