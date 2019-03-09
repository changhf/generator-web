package com.generator.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by .JA
 * Company 北京众信金融
 */
@Data
public class GeneratorParam implements Serializable {

    private String connection;

    private String dataBase;

    private String port;

    private String userId;

    private String userPass;

    private String modelPath;

    private String mappingPath;

    private String daoPath;

    private String buildPath;

    private String[] tableNames;

    private String[] modelNames;

    private String isHump;


}