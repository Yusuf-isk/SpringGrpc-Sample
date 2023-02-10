import com.proto.CalculatorServiceGrpc;
import com.proto.SumRequest;
import com.proto.SumResponse;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;


import java.io.IOException;

public class CalculatorServiceImplTest {
//    @Rule
//    public GrpcCleanupRule grpcCleanupRule = new GrpcCleanupRule();
//
//    CalculatorServiceGrpc.CalculatorServiceBlockingStub serviceImplBlockingStub;
//
//    @Before
//    public void setUp() throws IOException {
//        String serverName = InProcessServerBuilder.generateName();
//
//        CalculatorServiceImpl calculatorServiceGrpc = new CalculatorServiceImpl();
//
//        grpcCleanupRule.register(InProcessServerBuilder.forName(serverName).directExecutor()
//                .addService(calculatorServiceGrpc).build().start());
//        serviceImplBlockingStub = CalculatorServiceGrpc.newBlockingStub(grpcCleanupRule
//                .register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));
//    }
//
//    @Test
//    public void testSum() {
//        SumResponse sum = serviceImplBlockingStub.sum(SumRequest.newBuilder().setFirstNumber(10).setSecondNumber(20).build());
//        Assert.assertEquals(30, sum);
//    }
}
