# SequentialDoubleArrayValidator

Type: class | Package: com.hypixel.hytale.codec.validation.validator

public class SequentialDoubleArrayValidator implements Validator<double[]>

## Constants

- public static final SequentialDoubleArrayValidator NEQ_INSTANCE
- public static final SequentialDoubleArrayValidator ALLOW_EQ_INSTANCE

## Fields

- private final boolean allowEquals

## Methods

- public SequentialDoubleArrayValidator(boolean allowEquals)
- public void accept(@Nonnull double[] doubles, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, Schema target)
