# BuilderInfo

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class BuilderInfo

Metadata about a loaded NPC builder. Tracks the builder's index in the BuilderManager cache, its key name, the file path it was loaded from, and its current validation state.

## Inner Types

### State (enum)


protected static enum State

- NEEDS_RELOAD | The file has changed and the builder must be re-read.
- NEEDS_VALIDATION | The builder has been read but not yet validated.
- VALID | Validation succeeded.
- INVALID | Validation failed.
- REMOVED | The builder has been unloaded.

## Constructor


public BuilderInfo(int index, String keyName, Builder<?> builder, Path path)

Initial state is `NEEDS_VALIDATION`.

## Methods

### getIndex / getKeyName / getBuilder / getPath


public int getIndex()
public String getKeyName()
public Builder<?> getBuilder()
public Path getPath()

### isValidated


public boolean isValidated()

Returns `true` if the state is `VALID` or `INVALID`.

### isValid


public boolean isValid()

Returns `true` only if the state is `VALID`.

### setValidated


public boolean setValidated(boolean success)

Sets the state to `VALID` or `INVALID` based on the argument and returns the same boolean.

### setForceValidation / setNeedsValidation / setNeedsReload


public void setForceValidation()
public void setNeedsValidation()
public void setNeedsReload()

State transition methods. `setNeedsValidation` and `setNeedsReload` are no-ops if the builder is `REMOVED`.

### canBeValidated


public boolean canBeValidated()

Returns `true` if the state is not `NEEDS_RELOAD` or `REMOVED`.

### needsValidation


public boolean needsValidation()

Returns `true` if the state is `NEEDS_VALIDATION`.

### setRemoved / isRemoved


public void setRemoved()
public boolean isRemoved()

## Related Types

- BuilderManager -- owns the builder cache containing these info objects
- Builder -- the builder instance stored in this info
