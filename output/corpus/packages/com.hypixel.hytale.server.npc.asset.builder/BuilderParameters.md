# BuilderParameters

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderParameters

Manages the parameter definitions and expression scope for a builder. Parameters are defined in a `"Parameters"` JSON block and consist of expressions with optional type hints, validation constraints, descriptions, and privacy flags. The class also manages the compile context for expression compilation and dependency tracking.

## Constants

- KEY_PARAMETERS | "Parameters"
- KEY_IMPORT_STATES | "_ImportStates"
- KEY_INTERFACE | "Interface"

## Fields

- parameters | Map<String, Parameter> | Named parameter definitions.
- scope | StdScope | The expression evaluation scope.
- compileContext | CompileContext | Context for compiling expressions.
- fileName | String | Source file name.
- dependencies | IntSet | Builder dependency indices.
- interfaceCode | String | Interface code for component matching.

## Methods

### readJSON


public void readJSON(@Nonnull JsonObject jsonObject, @Nonnull StateMappingHelper stateHelper)

Reads the `"Parameters"` block from JSON. Parses each entry as a `Parameter`, and handles `"_ImportStates"` for component state import mapping.

### addParametersToScope


public void addParametersToScope()

Adds all parameter expressions to the scope.

### getParameterType


public ValueType getParameterType(String name)

Returns the value type of a parameter, or `VOID` if not found or private.

### compile / getInstructions / getConstantOperand


public ValueType compile(@Nonnull String expression)
public List<ExecutionContext.Instruction> getInstructions()
@Nullable
public ExecutionContext.Operand getConstantOperand()

Expression compilation methods delegating to the compile context.

### getScope / createScope


public StdScope getScope()
@Nonnull
public StdScope createScope()

### validateNoDuplicateParameters


public void validateNoDuplicateParameters(@Nonnull BuilderParameters other)

Ensures no parameter name collides with a parent scope's parameter.

## Inner Types

### Parameter


public static class Parameter

A single parameter definition containing an expression, description, validation/confinement code, and privacy flag.

- KEY_VALUE | "Value"
- KEY_TYPE_HINT | "TypeHint"
- KEY_VALIDATE | "Validate"
- KEY_CONFINE | "Confine"
- KEY_DESCRIPTION | "Description"
- KEY_PRIVATE | "Private"

## Related Types

- BuilderModifier -- overrides parameters via the `"Modify"` block
- BuilderBase -- owns a `BuilderParameters` instance
- StateMappingHelper -- handles imported state mappings
