---
title: "InstructionRandomized"
kind: "class"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.InstructionRandomized"
api_surface: false
extends: "Instruction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "instructions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.instructions`

```java
public class InstructionRandomized extends Instruction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IWeightedMap<InstructionRandomized.InstructionHolder>` | `weightedInstructionMap` |
| `protected final` | `boolean` | `resetOnStateChange` |
| `protected final` | `double` | `minExecuteTime` |
| `protected final` | `double` | `maxExecuteTime` |
| `protected` | `double` | `timeout` |
| `protected` | `InstructionRandomized.InstructionHolder` | `current` |
| `protected static final` | `InstructionRandomized.InstructionHolder[]` | `EMPTY_ARRAY` |
| `private final` | `Instruction` | `instruction` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `clearOnce()` |
| `@Override public` | `void` | `reset()` |

## Inner Types

- `InstructionRandomized.InstructionHolder`
