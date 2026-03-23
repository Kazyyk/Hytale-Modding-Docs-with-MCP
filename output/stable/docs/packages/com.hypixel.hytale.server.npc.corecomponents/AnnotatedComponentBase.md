---
title: "AnnotatedComponentBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.AnnotatedComponentBase"
api_surface: false
extends: ~
implements: ["IAnnotatedComponent"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public abstract class AnnotatedComponentBase implements IAnnotatedComponent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `IAnnotatedComponent` | `parent` |
| `protected` | `int` | `index` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `getInfo(Role role, ComponentInfo holder)` |
| `@Override public` | `void` | `setContext(IAnnotatedComponent parent, int index)` |
| `@Override public` | `IAnnotatedComponent` | `getParent()` |
| `@Override public` | `int` | `getIndex()` |
