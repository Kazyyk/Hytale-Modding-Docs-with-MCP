---
title: "SpawnJob"
kind: "class"
package: "com.hypixel.hytale.server.spawning.jobs"
fqcn: "com.hypixel.hytale.server.spawning.jobs.SpawnJob"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "jobs"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.jobs`

```java
public abstract class SpawnJob
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `HytaleLogger` | `LOGGER` |
| `private static` | `int` | `jobIdCounter` |
| `protected final` | `int` | `jobId` |
| `protected final` | `SpawningContext` | `spawningContext` |
| `protected` | `int` | `columnBudget` |
| `protected` | `int` | `budgetUsed` |
| `protected` | `boolean` | `terminated` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getJobId()` |
| `public` | `int` | `getBudgetUsed()` |
| `public` | `void` | `setBudgetUsed(int budgetUsed)` |
| `public` | `int` | `getColumnBudget()` |
| `public` | `void` | `setColumnBudget(int columnBudget)` |
| `@Nonnull public` | `SpawningContext` | `getSpawningContext()` |
| `protected` | `void` | `beginProbing()` |
| `public` | `void` | `reset()` |
| `public` | `boolean` | `budgetAvailable()` |
| `public` | `boolean` | `isTerminated()` |
| `public` | `void` | `setTerminated(boolean terminated)` |
| `@Nullable public abstract` | `ISpawnableWithModel` | `getSpawnable()` |
| `public abstract` | `boolean` | `shouldTerminate()` |
| `@Nullable public abstract` | `String` | `getSpawnableName()` |
