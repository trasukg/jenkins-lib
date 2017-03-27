/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.webage.demo.jenkins

import java.text.SimpleDateFormat

/**
 *
 * @author trasukg
 */
class SimpleClass {
 int square(int a) {
  return a * a; 
 }

 def sayHello(def name) {
  return "Hi, ${name}";
 }

 def getDateTime() {
  def date = new Date()
  def sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
  return sdf.format(date);
 }
}

