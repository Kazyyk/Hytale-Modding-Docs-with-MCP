---
title: "NPCRoleValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.validators"
fqcn: "com.hypixel.hytale.server.npc.validators.NPCRoleValidator"
api_surface: false
extends: null
implements: ["LateValidator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "validators"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.validators`

```java
public class NPCRoleValidator implements LateValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `NPCRoleValidator` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `accept(String s, ValidationResults results)` |
| `@Override public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
| `public` | `void` | `acceptLate(String s, ValidationResults results, ExtraInfo extraInfo)` |
