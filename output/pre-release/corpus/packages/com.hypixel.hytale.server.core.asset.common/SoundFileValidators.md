# SoundFileValidators

Type: class | Package: com.hypixel.hytale.server.core.asset.common

public class SoundFileValidators

Validators that check whether OGG sound files have the expected channel count (mono or stereo). Uses `OggVorbisInfoCache` to inspect audio metadata.

## Constants

- public static final ChannelValidator MONO
- public static final ChannelValidator STEREO

## Methods

- @Nonnull public static String getEncoding(int channelCount)

## Inner Classes

### ChannelValidator

Implements `Validator<String>`. Checks that a named sound file's channel count matches the expected value.
