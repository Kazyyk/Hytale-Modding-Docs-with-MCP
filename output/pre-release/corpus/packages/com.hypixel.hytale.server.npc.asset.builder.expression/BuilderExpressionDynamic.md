# BuilderExpressionDynamic

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression | Extends: BuilderExpression

public abstract class BuilderExpressionDynamic extends BuilderExpression

## Constants

- public static final String KEY_COMPUTE

## Fields

- public static final String KEY_COMPUTE
- private final String expression
- private final ExecutionContext.Instruction[] instructionSequence

## Methods

- public BuilderExpressionDynamic(String expression, ExecutionContext.Instruction[] instructionSequence)
- public boolean isStatic()
- public String getExpression()
- protected void execute(@Nonnull ExecutionContext executionContext)
- public static BuilderExpression fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters)
- public static Schema toSchema()
- public static Schema computableSchema(Schema toWrap)

Known subclasses: BuilderExpressionDynamicBoolean, BuilderExpressionDynamicBooleanArray, BuilderExpressionDynamicNumber, BuilderExpressionDynamicNumberArray, BuilderExpressionDynamicString, BuilderExpressionDynamicStringArray

Also in this package: BuilderExpression, BuilderExpressionDynamicBoolean, BuilderExpressionDynamicBooleanArray, BuilderExpressionDynamicNumber, BuilderExpressionDynamicNumberArray, BuilderExpressionDynamicString, BuilderExpressionDynamicStringArray, BuilderExpressionStaticBoolean, BuilderExpressionStaticBooleanArray, BuilderExpressionStaticEmptyArray, BuilderExpressionStaticNumber, BuilderExpressionStaticNumberArray, BuilderExpressionStaticString, BuilderExpressionStaticStringArray, SchemaGenerator

Complete API:
  public boolean isStatic()
  public String getExpression()
  protected void execute(ExecutionContext executionContext)
  public static BuilderExpression fromJSON(JsonElement jsonElement, BuilderParameters builderParameters)
  public static Schema toSchema()
  public static Schema computableSchema(Schema toWrap)

Fields:
public static final String KEY_COMPUTE
private final String expression
private final ExecutionContext.Instruction[] instructionSequence
