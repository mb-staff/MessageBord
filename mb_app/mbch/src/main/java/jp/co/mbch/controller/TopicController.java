package jp.co.mbch.controller;

import jp.co.mbch.logic.TopicLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopicController {

    @Autowired
    TopicLogic topicLogic;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView init() {

        // ModelAndViewのインスタンス生成
        ModelAndView mav = new ModelAndView("categoryAdd");

        // ModelAndViewにセット
        mav.addObject("CategoryAddInputForm", categoryAddInputForm);

        // カテゴリ一覧画面の表示
        return mav;
    }

}
