---
title: "InstructionContextHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.InstructionContextHelper"
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
public class InstructionContextHelper
```

Validates that components are placed in appropriate instruction and sensor contexts within the NPC behavior tree. Tracks the current [InstructionType](InstructionType.md) and [ComponentContext](ComponentContext.md), and runs registered evaluators to check context compatibility.

## Constructor

```java
public InstructionContextHelper(InstructionType context)
```

## Methods

### isComponent

```java
public boolean isComponent()
```

Returns `true` if the instruction context is `InstructionType.Component`.

### setComponentContext

```java
public void setComponentContext(ComponentContext context)
```

### isInCorrectInstruction

```java
public boolean isInCorrectInstruction(@Nonnull EnumSet<InstructionType> validTypes)
public static boolean isInCorrectInstruction(@Nonnull EnumSet<InstructionType> validTypes, InstructionType instructionContext)
```

Checks if the current instruction type is in the set of valid types.

### extraContextMatches

```java
public boolean extraContextMatches(@Nullable EnumSet<ComponentContext> contexts)
public static boolean extraContextMatches(@Nullable EnumSet<ComponentContext> validContexts, ComponentContext context)
```

Checks if the component context matches. Returns `true` if the valid set is `null` (no constraint).

### addComponentContextEvaluator

```java
public void addComponentContextEvaluator(BiConsumer<InstructionType, ComponentContext> evaluator)
```

Registers a validator to run during `validateComponentContext`.

### validateComponentContext

```java
public void validateComponentContext(InstructionType instructionContext, ComponentContext componentContext)
```

Runs all registered evaluators. Only valid when `isComponent()` is `true`.

### getInstructionContext / getComponentContext

```java
public InstructionType getInstructionContext()
public ComponentContext getComponentContext()
```

## Related Types

- [InstructionType](InstructionType.md) -- instruction context enum
- [ComponentContext](ComponentContext.md) -- sensor context enum
- [Builder](Builder.md) -- `getInstructionContextHelper()` returns this
