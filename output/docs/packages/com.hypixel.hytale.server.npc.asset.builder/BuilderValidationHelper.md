---
title: "BuilderValidationHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderValidationHelper"
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
public class BuilderValidationHelper
```

Bundles all contextual objects needed during builder configuration reading and validation into a single parameter object. Passed to `Builder.readConfig()` and used by [BuilderBase](BuilderBase.md) to initialize its internal state.

## Constructor

```java
public BuilderValidationHelper(String name, FeatureEvaluatorHelper featureEvaluator, InternalReferenceResolver internalReferenceResolver, StateMappingHelper stateMappingHelper, InstructionContextHelper instructionContextHelper, ExtraInfo extraInfo, List<Evaluator<?>> evaluators, List<String> readErrors)
```

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getName()` | `String` | The builder/file name. |
| `getFeatureEvaluatorHelper()` | [FeatureEvaluatorHelper](FeatureEvaluatorHelper.md) | Feature evaluation context. |
| `getInternalReferenceResolver()` | [InternalReferenceResolver](InternalReferenceResolver.md) | Local reference resolver. |
| `getStateMappingHelper()` | [StateMappingHelper](StateMappingHelper.md) | State machine helper. |
| `getInstructionContextHelper()` | [InstructionContextHelper](InstructionContextHelper.md) | Instruction context. |
| `getExtraInfo()` | `ExtraInfo` | Codec extra info. |
| `getReadErrors()` | `List<String>` | Mutable error list. |
| `getEvaluators()` | `List<Evaluator<?>>` | Decision maker evaluators. |

## Related Types

- [BuilderBase](BuilderBase.md) -- uses this during `preReadConfig`
- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- passes this to child builders
