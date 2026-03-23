---
title: "TickingThread"
kind: "class"
package: "com.hypixel.hytale.server.core.util.thread"
fqcn: "com.hypixel.hytale.server.core.util.thread.TickingThread"
api_surface: true
extends: null
implements: ["Runnable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "util"
  - "thread"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.util.thread`

```java
public abstract class TickingThread implements Runnable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `NANOS_IN_ONE_MILLI` |
| `public static final` | `int` | `NANOS_IN_ONE_SECOND` |
| `public static final` | `int` | `TPS` |
| `public static` | `long` | `SLEEP_OFFSET` |
| `private final` | `String` | `threadName` |
| `private final` | `boolean` | `daemon` |
| `private final` | `AtomicBoolean` | `needsShutdown` |
| `private` | `int` | `tps` |
| `private` | `int` | `tickStepNanos` |
| `private` | `HistoricMetric` | `bufferedTickLengthMetricSet` |
| `private` | `Thread` | `thread` |
| `private` | `CompletableFuture<Void>` | `startedFuture` |
| `private` | `PluginIdentifier` | `possibleFailureCause` |
| `private` | `Throwable` | `failureException` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run()` |
| `protected` | `boolean` | `isIdle()` |
| `protected abstract` | `void` | `tick(float var1)` |
| `protected` | `void` | `onStart()` |
| `protected abstract` | `void` | `onShutdown()` |
| `@Nonnull public` | `CompletableFuture<Void>` | `start()` |
| `public` | `boolean` | `interrupt()` |
| `public` | `void` | `stop()` |
| `public` | `void` | `setTps(int tps)` |
| `public` | `int` | `getTps()` |
| `public` | `int` | `getTickStepNanos()` |
| `public` | `HistoricMetric` | `getBufferedTickLengthMetricSet()` |
| `public` | `void` | `clearMetrics()` |
| `public` | `void` | `debugAssertInTickingThread()` |
| `public` | `boolean` | `isInThread()` |
| `public` | `boolean` | `isStarted()` |
| `@Nullable public` | `PluginIdentifier` | `getPossibleFailureCause()` |
| `@Nullable public` | `Throwable` | `getFailureException()` |
| `@Deprecated protected` | `void` | `setThread(Thread thread)` |
| `@Nullable protected` | `Thread` | `getThread()` |
