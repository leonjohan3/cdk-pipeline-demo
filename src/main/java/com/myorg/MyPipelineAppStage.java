package com.myorg;

import software.amazon.awscdk.Stage;
import software.amazon.awscdk.StageProps;
import software.constructs.Construct;

public class MyPipelineAppStage extends Stage {

    public MyPipelineAppStage(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public MyPipelineAppStage(final Construct scope, final String id, final StageProps props) {
        super(scope, id, props);

        new MyPipelineLambdaStack(this, "LambdaStack");
    }
}
