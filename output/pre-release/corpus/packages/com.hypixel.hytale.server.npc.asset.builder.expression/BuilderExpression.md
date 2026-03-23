# BuilderExpression

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.expression

public abstract class BuilderExpression

## Constants

- public static final String STATIC

## Fields

- public static final String STATIC

## Methods

- public abstract ValueType getType()
- public abstract boolean isStatic()
- public double getNumber(ExecutionContext executionContext)
- public String getString(ExecutionContext executionContext)
- public boolean getBoolean(ExecutionContext executionContext)
- public double[] getNumberArray(ExecutionContext executionContext)
- public int[] getIntegerArray(ExecutionContext executionContext)
- public String[] getStringArray(ExecutionContext executionContext)
- public boolean[] getBooleanArray(ExecutionContext executionContext)
- public void addToScope(String name, StdScope scope)
- public void updateScope(StdScope scope, String name, ExecutionContext executionContext)
- public String getExpression()
- public static BuilderExpression fromOperand(@Nonnull ExecutionContext.Operand operand)
- public static BuilderExpression fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters, boolean constantsOnly)
- public static BuilderExpression fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters, ValueType expectedType)
- public static BuilderExpression fromJSON(@Nonnull JsonElement jsonElement, @Nonnull BuilderParameters builderParameters)
- private static BuilderExpression readJSONPrimitive(@Nonnull JsonElement jsonElement)
- private static BuilderExpression readStaticArray(@Nonnull JsonElement jsonElement)
- public void compile(BuilderParameters builderParameters)
- public static Schema toSchema(@Nonnull SchemaContext context)
- public String getSchemaName()
- public Schema toSchema(@Nonnull SchemaContext context)

Known subclasses: BuilderExpressionDynamic, BuilderExpressionStaticBoolean, BuilderExpressionStaticBooleanArray, BuilderExpressionStaticEmptyArray, BuilderExpressionStaticNumber, BuilderExpressionStaticNumberArray, BuilderExpressionStaticString, BuilderExpressionStaticStringArray

Also in this package: BuilderExpressionDynamic, BuilderExpressionDynamicBoolean, BuilderExpressionDynamicBooleanArray, BuilderExpressionDynamicNumber, BuilderExpressionDynamicNumberArray, BuilderExpressionDynamicString, BuilderExpressionDynamicStringArray, BuilderExpressionStaticBoolean, BuilderExpressionStaticBooleanArray, BuilderExpressionStaticEmptyArray, BuilderExpressionStaticNumber, BuilderExpressionStaticNumberArray, BuilderExpressionStaticString, BuilderExpressionStaticStringArray, SchemaGenerator

Complete API:
  public abstract ValueType getType()
  public abstract boolean isStatic()
  public double getNumber(ExecutionContext executionContext)
  public String getString(ExecutionContext executionContext)
  public boolean getBoolean(ExecutionContext executionContext)
  public double[] getNumberArray(ExecutionContext executionContext)
  public int[] getIntegerArray(ExecutionContext executionContext)
  public String[] getStringArray(ExecutionContext executionContext)
  public boolean[] getBooleanArray(ExecutionContext executionContext)
  public void addToScope(String name, StdScope scope)
  public void updateScope(StdScope scope, String name, ExecutionContext executionContext)
  public String getExpression()
  public static BuilderExpression fromOperand(ExecutionContext.Operand operand)
  public static BuilderExpression fromJSON(JsonElement jsonElement, BuilderParameters builderParameters, boolean constantsOnly)
  public static BuilderExpression fromJSON(JsonElement jsonElement, BuilderParameters builderParameters, ValueType expectedType)
  public static BuilderExpression fromJSON(JsonElement jsonElement, BuilderParameters builderParameters)
  private static BuilderExpression readJSONPrimitive(JsonElement jsonElement)
  private static BuilderExpression readStaticArray(JsonElement jsonElement)
  public void compile(BuilderParameters builderParameters)
  public static Schema toSchema(SchemaContext context)

Fields:
public static final String STATIC
