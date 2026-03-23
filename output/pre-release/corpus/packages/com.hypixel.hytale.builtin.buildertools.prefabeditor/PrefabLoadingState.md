# PrefabLoadingState

Type: class | Package: com.hypixel.hytale.builtin.buildertools.prefabeditor

public class PrefabLoadingState

Tracks the progress of a prefab loading operation through multiple phases. Provides progress percentage calculation, status messages with translatable keys, error accumulation, and timing information. Used by both the loading and cancellation workflows to report state to the UI.

## Methods

- setTotalPrefabs(int) | void | Sets the total number of prefabs to load.
- setPhase(Phase) | void | Advances to a new loading phase.
- onPrefabLoaded(Path) | void | Records that a prefab file was loaded.
- onPrefabPasted(Path) | void | Records that a prefab was pasted into the world.
- addError(String) | void | Adds an error with a translation key.
- addError(String, String) | void | Adds an error with details.
- getCurrentPhase() | Phase | Returns the current phase.
- getProgressPercentage() | float | Returns progress [0.0, 1.0] based on phase and prefab counts.
- getStatusMessage() | Message | Returns a translatable status message for the current phase.
- hasErrors() | boolean | Whether any errors have been recorded.
- getErrors() | List<LoadingError> | Returns all errors.
- isShuttingDown() | boolean | Whether in a cancellation/shutdown phase.
- isShutdownComplete() | boolean | Whether shutdown is complete.
- markComplete() | void | Sets the phase to COMPLETE.
- getElapsedTimeMillis() | long | Returns elapsed time since loading started.

## Inner Types

### Phase (enum)

Loading phases with associated translation keys.

- INITIALIZING | Initial setup.
- CREATING_WORLD | Creating the editor world.
- LOADING_PREFABS | Loading prefab files from disk.
- PASTING_PREFABS | Pasting prefabs into the world.
- FINALIZING | Finalizing the session.
- COMPLETE | Loading complete.
- ERROR | An error occurred.
- CANCELLING | User-initiated cancellation.
- SHUTTING_DOWN_WORLD | Shutting down the editor world.
- DELETING_WORLD | Deleting the editor world files.
- SHUTDOWN_COMPLETE | Cancellation complete.

### LoadingError (record)

- translationKey | String | Localization key for the error.
- details | String | Additional details, or null.

## See Also

- PrefabEditSessionManager

Also in this package: BlockBreakDirtySystem, BlockPlaceDirtySystem, LoadingError, Phase, PrefabAnchor, PrefabDirtySystems, PrefabEditSession, PrefabEditSessionManager, PrefabEditingMetadata, PrefabEditorCreationContext, PrefabEditorCreationSettings, PrefabMarkerProvider, PrefabSelectionInteraction, Tri

Complete API:
  public void setTotalPrefabs(int totalPrefabs)
  public void setPhase(PrefabLoadingState.Phase phase)
  public void onPrefabLoaded(Path path)
  public void onPrefabPasted(Path path)
  public void addError(PrefabLoadingState.LoadingError error)
  public void addError(String translationKey)
  public void addError(String translationKey, String details)
  public PrefabLoadingState.Phase getCurrentPhase()
  public int getTotalPrefabs()
  public int getLoadedPrefabs()
  public int getPastedPrefabs()
  public Path getCurrentPrefabPath()
  public List<PrefabLoadingState.LoadingError> getErrors()
  public boolean hasErrors()
  public boolean isShuttingDown()
  public boolean isShutdownComplete()
  public float getProgressPercentage()
  public long getElapsedTimeMillis()
  public long getLastNotifyTimeNanos()
  public void setLastNotifyTimeNanos(long nanos)
  public Message getStatusMessage()
  public void markComplete()

Fields:
private PrefabLoadingState.Phase currentPhase
private int totalPrefabs
private int loadedPrefabs
private int pastedPrefabs
private Path currentPrefabPath
private final List<PrefabLoadingState.LoadingError> errors
private long startTimeNanos
private long lastUpdateTimeNanos
private long lastNotifyTimeNanos
