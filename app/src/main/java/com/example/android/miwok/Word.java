package com.example.android.miwok;

/**
 * Created by nishant on 19/12/16.
 */

public class Word {
    /**
     * @Fields are engWords
     * @fields are resourceId
     * @Fields are miwokWords
     */
    private String engWords;
    private int resourceId=no_image;
    private String miwokWords;
    private int mediaId;
    private int playId=no_image;
    private static final int no_image=-1;

    /**
     * @constructor : Parameterized constructor for Word class
     */
    public Word(String mEng, String mMiwok)
    {
        engWords=mEng;
        miwokWords=mMiwok;
    }

    public Word(String mEng,String mMiwok, int mResource)
    {
        engWords=mEng;
        miwokWords=mMiwok;
        mediaId=mResource;
    }

    public Word(String mEng, String mMiwok, int mResource, int mMedia)
    {
        engWords=mEng;
        miwokWords=mMiwok;
        resourceId=mResource;
        mediaId=mMedia;
    }

    /**
     * @method getEngWords to,
     * @return engWords.
     */
    public String getEngWords()
    {
        return engWords;
    }

    /**
     * @method getMiwokWords to,
     * @return miwokWords.
     */
    public String getMiwokWords()
    {
        return miwokWords;
    }

    /**
     * @method getResourceId to,
     * @return resourceId.
     */
    public int getResourceId()
    {
        return resourceId;
    }

    public int getMediaId(){ return mediaId; }

    public boolean imageset()
    {
        return resourceId != no_image;
    }
}
