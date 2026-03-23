# ExtraInfo

Type: interface | Package: com.hypixel.hytale.codec

public abstract class ExtraInfo

Abstract base class providing contextual information during codec encode/decode operations. Tracks key paths for error reporting and provides push/pop operations for navigating nested structures.

## Methods

- public void pushKey(String key, RawJsonReader reader)
- public void pushIntKey(int key, RawJsonReader reader)
- public void popKey()
- public String getKeyPath()
