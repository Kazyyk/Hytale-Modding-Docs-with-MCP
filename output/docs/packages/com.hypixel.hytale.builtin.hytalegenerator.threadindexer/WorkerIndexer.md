---
title: "WorkerIndexer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.threadindexer"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.threadindexer.WorkerIndexer"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "threadindexer"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.threadindexer`

```java
public class WorkerIndexer
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `workerCount` |
| `@Nonnull private final` | `List<WorkerIndexer.Id>` | `ids` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorkerIndexer(int workerCount)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getWorkerCount()` |
| `@Nonnull public` | `List<WorkerIndexer.Id>` | `getWorkedIds()` |
| `@Nonnull public` | `WorkerIndexer.Session` | `createSession()` |

## Inner Types

- `WorkerIndexer.Data`
- `WorkerIndexer.Id`
- `WorkerIndexer.Session`
