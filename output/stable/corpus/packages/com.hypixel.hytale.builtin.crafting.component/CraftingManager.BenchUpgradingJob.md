# CraftingManager.BenchUpgradingJob

Type: class | Package: com.hypixel.hytale.builtin.crafting.component

private static class BenchUpgradingJob

Inner class of CraftingManager that tracks a bench tier upgrade operation.

## Fields

- window | BenchWindow | The bench window UI.
- timeSeconds | float | Total upgrade duration.
- timeSecondsCompleted | float | Elapsed time.
- lastSentPercent | float | Last progress percentage sent to client.

## Methods


public float computeLoadingPercent()

Returns the upgrade progress as a float between 0.0 and 1.0.

Also in this package: ChestLookupResult, CraftingJob, CraftingManager, InputRemovalType

Complete API:
  public String toString()
  public float computeLoadingPercent()

Fields:
private final BenchWindow window
private final float timeSeconds
private float timeSecondsCompleted
private float lastSentPercent
