---
title: "BuilderParameters"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderParameters"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderParameters
```

Manages the parameter definitions and expression scope for a builder. Parameters are defined in a `"Parameters"` JSON block and consist of expressions with optional type hints, validation constraints, descriptions, and privacy flags. The class also manages the compile context for expression compilation and dependency tracking.

## Constants

| Constant | Value |
|---|---|
| `KEY_PARAMETERS` | `"Parameters"` |
| `KEY_IMPORT_STATES` | `"_ImportStates"` |
| `KEY_INTERFACE` | `"Interface"` |

## Fields

| Field | Type | Description |
|---|---|---|
| `parameters` | `Map<String, Parameter>` | Named parameter definitions. |
| `scope` | `StdScope` | The expression evaluation scope. |
| `compileContext` | `CompileContext` | Context for compiling expressions. |
| `fileName` | `String` | Source file name. |
| `dependencies` | `IntSet` | Builder dependency indices. |
| `interfaceCode` | `String` | Interface code for component matching. |

## Methods

### readJSON

```java
public void readJSON(@Nonnull JsonObject jsonObject, @Nonnull StateMappingHelper stateHelper)
```

Reads the `"Parameters"` block from JSON. Parses each entry as a `Parameter`, and handles `"_ImportStates"` for component state import mapping.

### addParametersToScope

```java
public void addParametersToScope()
```

Adds all parameter expressions to the scope.

### getParameterType

```java
public ValueType getParameterType(String name)
```

Returns the value type of a parameter, or `VOID` if not found or private.

### compile / getInstructions / getConstantOperand

```java
public ValueType compile(@Nonnull String expression)
public List<ExecutionContext.Instruction> getInstructions()
@Nullable
public ExecutionContext.Operand getConstantOperand()
```

Expression compilation methods delegating to the compile context.

### getScope / createScope

```java
public StdScope getScope()
@Nonnull
public StdScope createScope()
```

### validateNoDuplicateParameters

```java
public void validateNoDuplicateParameters(@Nonnull BuilderParameters other)
```

Ensures no parameter name collides with a parent scope's parameter.

## Inner Types

### Parameter

```java
public static class Parameter
```

A single parameter definition containing an expression, description, validation/confinement code, and privacy flag.

| Constant | Value |
|---|---|
| `KEY_VALUE` | `"Value"` |
| `KEY_TYPE_HINT` | `"TypeHint"` |
| `KEY_VALIDATE` | `"Validate"` |
| `KEY_CONFINE` | `"Confine"` |
| `KEY_DESCRIPTION` | `"Description"` |
| `KEY_PRIVATE` | `"Private"` |

## Related Types

- [BuilderModifier](BuilderModifier.md) -- overrides parameters via the `"Modify"` block
- [BuilderBase](BuilderBase.md) -- owns a `BuilderParameters` instance
- [StateMappingHelper](StateMappingHelper.md) -- handles imported state mappings
