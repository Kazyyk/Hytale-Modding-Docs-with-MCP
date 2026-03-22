---
title: "ResourceFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.ResourceFilter"
api_surface: false
extends: ~
implements: ["ItemSlotFilter"]
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
  - "resource"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public class ResourceFilter implements ItemSlotFilter
```

Slot filter that only permits items that provide the configured `ResourceQuantity` type. Checks via `resource.getResourceType(item)`.

## Constructors

```java
public ResourceFilter(ResourceQuantity resource)
```

Creates a filter for the given resource type.

## Methods

```java
@Override
public boolean test(@Nullable Item item)
```

Returns `true` if the item is `null` or provides the configured resource type.

```java
public ResourceQuantity getResource()
```

Returns the resource quantity this filter checks against.
