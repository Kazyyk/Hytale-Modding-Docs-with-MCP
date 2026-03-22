---
title: "StringArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.StringArrayHolder"
api_surface: false
extends: "ArrayHolder"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.asset.builder.holder`

```java
public class StringArrayHolder extends ArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `StringArrayValidator` | `stringArrayValidator` |
| `protected` | `List<BiConsumer<ExecutionContext, String[]>>` | `relationValidators` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `StringArrayHolder()` |
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, StringArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, StringArrayValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `String[]` | `get(ExecutionContext executionContext)` |
| `public` | `String[]` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `validate(@Nullable String[] value)` |
| `public` | `void` | `addRelationValidator(BiConsumer<ExecutionContext, String[]> validator)` |
| `protected` | `void` | `validateRelations(ExecutionContext executionContext, String[] value)` |
