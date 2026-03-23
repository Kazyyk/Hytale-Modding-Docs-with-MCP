---
title: "InternalReferenceResolver"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.InternalReferenceResolver"
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
public class InternalReferenceResolver
```

Resolves local (internal) builder references within a single NPC role file. When a component uses `"Local": true` with a `"Reference"`, the reference points to another component defined in the same file rather than an external file. This resolver maintains a name-to-index map and a list of builder instruction references, and validates that no cyclic dependencies exist.

Currently only supports `Instruction` type references.

## Constructor

```java
public InternalReferenceResolver()
```

## Methods

### getOrCreateIndex

```java
public int getOrCreateIndex(String name)
```

Returns the index for the named reference, creating a new slot if necessary. If dependency recording is active, the index is recorded.

### setRecordDependencies / getRecordedDependenices / stopRecordingDependencies

```java
public void setRecordDependencies()
@Nullable
public IntSet getRecordedDependenices()
public void stopRecordingDependencies()
```

Controls dependency recording mode for cycle detection.

### addBuilder

```java
public void addBuilder(int index, BuilderInstructionReference builder)
```

Registers a builder at the given index. Throws on duplicate or out-of-range indices.

### validateInternalReferences

```java
public void validateInternalReferences(String configName, @Nonnull List<String> errors)
```

Validates that all referenced slots have builders and that no cyclic dependencies exist (via DFS).

### getBuilder

```java
public <T> Builder<T> getBuilder(int index, Class<?> classType)
```

Returns the builder at the given index. Throws `IllegalArgumentException` if `classType` is not `Instruction.class`.

### optimise

```java
public void optimise()
```

Releases the index and name maps after validation is complete.

## Related Types

- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- uses this for local references
- [BuilderValidationHelper](BuilderValidationHelper.md) -- carries this resolver
