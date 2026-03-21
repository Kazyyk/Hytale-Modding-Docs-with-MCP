---
title: "ActionType"
kind: "enum"
package: "com.hypixel.hytale.server.core.inventory.transaction"
fqcn: "com.hypixel.hytale.server.core.inventory.transaction.ActionType"
api_surface: true
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "inventory"
---
**Package:** `com.hypixel.hytale.server.core.inventory.transaction`

```java
public enum ActionType
```

## Enum Constants

| Constant |
|---|
| `SET` |
| `false` |
| `true` |
| `ADD` |
| `false` |
| `false` |
| `REMOVE` |
| `true` |
| `false` |
| `REPLACE` |
| `true` |
| `false` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `add` |
| `private final` | `boolean` | `remove` |
| `private final` | `boolean` | `destroy` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `ActionType(boolean add, boolean remove, boolean destroy)` |
| `public` | `boolean` | `isAdd()` |
| `public` | `boolean` | `isRemove()` |
| `public` | `boolean` | `isDestroy()` |
