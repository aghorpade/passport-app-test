package com.group.vfs.soaptests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

//@UseHttpClient(SslTrustHttpClient.class) //<-- Optional in case your end point is TLS
@TargetEnv("github-host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class EndToEndSoapTest {

    @Test
    @JsonTestCase("soap_tests/global_weather_soap_test.json")
    public void testWetherBySoap() throws Exception {
    }

}
