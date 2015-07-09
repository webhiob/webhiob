/***************************************************************************************************
 *
 *
 * This file is part of WebHiob, an Robert Rozmus utility.
 * WebHiob was created a as part of the master thesis by Robert Rozmus (student of Warsaw University of Technology, Institute of Computer Science)
 * Copyright (c) 2015 Robert Rozmus
 *
 * This program has got two licences:
 *  1. For non-commercial use - you can redistribute it and/or modify it under the terms of the
 *  		GNU General Public License version 3.0 (GPLv3);
 *
 *  2. For any commercial use (including payable academic lectures) - you must obtain the permission from the author
 *  (Robert Rozmus) to use it in these purposes
 *
 * @author <a href="mailto:robertrozmusjob@gmail.com">Robert Rozmus</a>
 */

package com.webhiob.shared.lessons.lesson.xss;

import com.webhiob.shared.lessons.LessonCategory;
import com.webhiob.shared.lessons.lessonhelper.creation.AngularJSLessonAdapter;

public class JsonpXSSAngularJS extends AngularJSLessonAdapter
{
    @Override
    public String getName()
    {
	return "Jsonp XSS";
    }

    @Override
    public String getViewName()
    {
	return "JsonpXSS";
    }

    @Override
    public LessonCategory getCategory()
    {
        return LessonCategory.XSS;
    }
}