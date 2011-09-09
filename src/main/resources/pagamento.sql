CREATE TABLE `pagamento` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `depositante` varchar(100) DEFAULT NULL,
  `codigo` int(5) DEFAULT NULL,
  `tipo` varchar(9) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `comentario` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`id`)
);