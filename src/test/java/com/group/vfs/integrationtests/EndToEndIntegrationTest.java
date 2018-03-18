package com.group.vfs.integrationtests;


import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("local-host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class EndToEndIntegrationTest {

    @Test
    @JsonTestCase("E2EIntegrationTest/Passport_App_Get_200_Success.json")
    public void testPassportAppGetAPi_200_Success() throws Exception {

    }

    @Test
    @JsonTestCase("E2EIntegrationTest/Passport_App_Get_404_Not_Found.json")
    public void testPassportAppGetAPi_404_notFound() throws Exception {

    }

    @Test
    @JsonTestCase("E2EIntegrationTest/Passport_App_Get_400_Bad_Request.json")
    public void testPassportAppGetAPi_400_invalidPassportNum() throws Exception {

    }

}
