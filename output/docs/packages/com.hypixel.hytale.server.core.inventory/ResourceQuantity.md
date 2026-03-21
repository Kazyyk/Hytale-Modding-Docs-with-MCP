---
title: "ResourceQuantity"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory"
fqcn: "com.hypixel.hytale.server.core.inventory.ResourceQuantity"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "inventory"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.inventory`

```java
public class ResourceQuantity
```

Represents a quantity of a named resource identified by resource ID. Used alongside [MaterialQuantity](MaterialQuantity.md) for crafting and resource tracking.

## Constructors

| Signature |
|---|
| `ResourceQuantity(String resourceId, int quantity)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getResourceId()` |
| `public` | `int` | `getQuantity()` |
| `public` | `ResourceQuantity` | `clone(int quantity)` |
| `public` | `ItemResourceType` | `getResourceType(Item item)` |
