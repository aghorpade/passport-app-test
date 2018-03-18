package com.group.vfs.contracttests;


import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.domain.UseHttpClient;
import org.jsmart.zerocode.core.httpclient.ssl.SslTrustHttpClient;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

//@UseHttpClient(SslTrustHttpClient.class) //<-- Optional in case your end point is TLS
@TargetEnv("github-host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class EndToEndContractTest {

    @Test
    @JsonTestCase("contract_tests/github_get_user_200_ok.json")
    public void testGitHubGetUser() throws Exception {
    }

    @Test
    @JsonTestCase("contract_tests/github_get_invalid_user_404_not_found.json")
    public void testGitHubGetInvalidUser() throws Exception {
    }

}
