# StdScope

Type: class | Package: com.hypixel.hytale.server.npc.util.expression | Implements: com.hypixel.hytale.server.npc.util.expression.Scope

public class StdScope implements Scope

Standard implementation of Scope backed by a `HashMap<String, Symbol>` symbol table and an optional parent scope for hierarchical lookup. Provides methods to add constants, mutable variables, supplier-backed variables, and functions (both invariant and variant). Symbol lookup walks the parent chain when a name is not found locally.

## Fields

- protected Scope parent
- protected Map<String, Symbol> symbolTable

## Constructors

- public StdScope(Scope parent)

## Factory Methods

- @Nonnull public static StdScope copyOf(@Nonnull StdScope other)
- @Nonnull public static StdScope mergeScopes(@Nonnull StdScope first, @Nonnull StdScope second)

## Symbol Registration

- public void addConst(String name, @Nullable String value)
- public void addConst(String name, double value)
- public void addConst(String name, boolean value)
- public void addConst(String name, @Nullable String[] value)
- public void addConst(String name, @Nullable double[] value)
- public void addConst(String name, @Nullable boolean[] value)
- public void addConstEmptyArray(String name)
- public void addVar(String name, @Nullable String value)
- public void addVar(String name, double value)
- public void addVar(String name, boolean value)
- public void addVar(String name, @Nullable String[] value)
- public void addVar(String name, @Nullable double[] value)
- public void addVar(String name, @Nullable boolean[] value)
- public void addSupplier(String name, Supplier<String> value)
- public void addSupplier(String name, DoubleSupplier value)
- public void addSupplier(String name, BooleanSupplier value)
- public void addStringArraySupplier(String name, Supplier<String[]> value)
- public void addDoubleArraySupplier(String name, Supplier<double[]> value)
- public void addBooleanArraySupplier(String name, Supplier<boolean[]> value)
- public void addInvariant(@Nonnull String name, Scope.Function function, ValueType returnType, @Nonnull ValueType... argumentTypes)
- public void addVariant(@Nonnull String name, Scope.Function function, ValueType returnType, @Nonnull ValueType... argumentTypes)

## Value Mutation

- public void changeValue(String name, @Nullable String value)
- public void changeValue(String name, double value)
- public void changeValue(String name, boolean value)
- public void changeValue(String name, @Nullable String[] value)
- public void changeValue(String name, @Nullable double[] value)
- public void changeValue(String name, @Nullable boolean[] value)
- public void changeValueToEmptyArray(String name)

## Inner Types

Seven protected static inner classes form the symbol hierarchy: `Symbol` (base with `isConstant` and `valueType`), `SymbolString`, `SymbolNumber`, `SymbolBoolean`, `SymbolStringArray`, `SymbolNumberArray`, `SymbolBooleanArray`, and `SymbolFunction`. Each typed subclass wraps the corresponding supplier or function reference.

## Related Types

- Scope -- interface this class implements
- StdLib -- singleton subclass providing built-in functions
- ValueType -- type discriminant used by symbols

Known subclasses: StdLib

Also in this package: ExecutionContext, Expression, Function, Instruction, Operand, Scope, StdLib, Symbol, SymbolBoolean, SymbolBooleanArray, SymbolFunction, SymbolNumber, SymbolNumberArray, SymbolString, SymbolStringArray, ValueType

Complete API:
  public static StdScope copyOf(StdScope other)
  public StdScope merge(StdScope other)
  public static StdScope mergeScopes(StdScope first, StdScope second)
  protected void mergeSymbols(StdScope other)
  protected void add(String name, StdScope.Symbol symbol)
  public void addConst(String name, String value)
  public void addConst(String name, double value)
  public void addConst(String name, boolean value)
  public void addConst(String name, String[] value)
  public void addConst(String name, double[] value)
  public void addConst(String name, boolean[] value)
  public void addConstEmptyArray(String name)
  public void addVar(String name, String value)
  public void addVar(String name, double value)
  public void addVar(String name, boolean value)
  public void addVar(String name, String[] value)
  public void addVar(String name, double[] value)
  public void addVar(String name, boolean[] value)
  public void addInvariant(String name, Scope.Function function, ValueType returnType, ValueType argumentTypes)
  public void addVariant(String name, Scope.Function function, ValueType returnType, ValueType argumentTypes)
  public void addSupplier(String name, Supplier<String> value)
  public void addSupplier(String name, DoubleSupplier value)
  public void addSupplier(String name, BooleanSupplier value)
  public void addStringArraySupplier(String name, Supplier<String[]> value)
  public void addDoubleArraySupplier(String name, Supplier<double[]> value)
  public void addBooleanArraySupplier(String name, Supplier<boolean[]> value)
  protected StdScope.Symbol get(String name)
  protected StdScope.Symbol get(String name, ValueType valueType)
  protected void replace(String name, StdScope.Symbol symbol)
  public void changeValue(String name, String value)
  public void changeValue(String name, double value)
  public void changeValue(String name, boolean value)
  public void changeValue(String name, String[] value)
  public void changeValue(String name, double[] value)
  public void changeValue(String name, boolean[] value)
  public void changeValueToEmptyArray(String name)
  public Supplier<String> getStringSupplier(String name)
  public DoubleSupplier getNumberSupplier(String name)
  public BooleanSupplier getBooleanSupplier(String name)
  public Supplier<String[]> getStringArraySupplier(String name)
  public Supplier<double[]> getNumberArraySupplier(String name)
  public Supplier<boolean[]> getBooleanArraySupplier(String name)
  public Scope.Function getFunction(String name)
  public boolean isConstant(String name)
  public ValueType getType(String name)

Fields:
protected static final StdScope.SymbolStringArray VAR_EMPTY_STRING_ARRAY
protected static final StdScope.SymbolNumberArray VAR_EMPTY_NUMBER_ARRAY
protected static final StdScope.SymbolBooleanArray VAR_EMPTY_BOOLEAN_ARRAY
protected static final StdScope.SymbolStringArray VAR_NULL_STRING_ARRAY
protected static final StdScope.SymbolNumberArray VAR_NULL_NUMBER_ARRAY
protected static final StdScope.SymbolBooleanArray VAR_NULL_BOOLEAN_ARRAY
protected static final StdScope.SymbolString VAR_NULL_STRING
protected static final StdScope.SymbolString VAR_EMPTY_STRING
protected static final StdScope.SymbolBoolean VAR_BOOLEAN_TRUE
protected static final StdScope.SymbolBoolean VAR_BOOLEAN_FALSE
protected static final StdScope.SymbolStringArray CONST_EMPTY_STRING_ARRAY
protected static final StdScope.SymbolNumberArray CONST_EMPTY_NUMBER_ARRAY
protected static final StdScope.SymbolBooleanArray CONST_EMPTY_BOOLEAN_ARRAY
protected static final StdScope.SymbolStringArray CONST_NULL_STRING_ARRAY
protected static final StdScope.SymbolNumberArray CONST_NULL_NUMBER_ARRAY
protected static final StdScope.SymbolBooleanArray CONST_NULL_BOOLEAN_ARRAY
protected static final StdScope.SymbolString CONST_NULL_STRING
protected static final StdScope.SymbolString CONST_EMPTY_STRING
protected static final StdScope.SymbolBoolean CONST_BOOLEAN_TRUE
protected static final StdScope.SymbolBoolean CONST_BOOLEAN_FALSE
protected Scope parent
protected Map<String,StdScope.Symbol> symbolTable
